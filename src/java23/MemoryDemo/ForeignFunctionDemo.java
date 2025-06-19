package java23.MemoryDemo;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

public class ForeignFunctionDemo {
    public static void main(String[] args) throws Throwable {
        Linker linker = Linker.nativeLinker();

        SymbolLookup lookup = linker.defaultLookup();
        MemorySegment strlen = lookup.find("strlen").orElseThrow();

        MethodHandle strlenHandle = linker.downcallHandle(
            strlen,
            MethodType.methodType(long.class, MemorySegment.class),
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );

        try (Arena arena = Arena.ofConfined()) {
            MemorySegment str = arena.allocateUtf8String("Hello FFM API!");
            long len = (long) strlenHandle.invoke(str);
            System.out.println("Length: " + len);
        }
    }
}
