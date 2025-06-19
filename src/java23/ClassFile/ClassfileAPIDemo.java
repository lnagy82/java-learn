package java23.ClassFile;

import jdk.internal.classfile.Classfile;
import jdk.internal.classfile.ClassfileBuilder;

import java.lang.constant.ClassDesc;
import java.lang.constant.MethodTypeDesc;
import java.nio.file.Files;
import java.nio.file.Path;

public class ClassfileAPIDemo {
    public static void main(String[] args) throws Exception {
        // 1️⃣ Új class fájl építése
        Classfile cf = Classfile.of(builder -> builder
            .withClassType("Hello")
            .withSuperClass("java/lang/Object")
            .withMethod("main",
                MethodTypeDesc.ofDescriptor("([Ljava/lang/String;)V"),
                ACC_PUBLIC | ACC_STATIC,
                code -> code
                    .invoke(
                        INVOKESTATIC,
                        ClassDesc.of("java/lang/System"),
                        "out",
                        MethodTypeDesc.ofDescriptor("()Ljava/io/PrintStream;")
                    )
                    .ldc("Hello from Classfile API!")
                    .invokeVirtual("java/io/PrintStream", "println",
                        MethodTypeDesc.ofDescriptor("(Ljava/lang/String;)V"))
                    .return_()
            )
        );

        // 2️⃣ Kiírás fájlba
        Path path = Path.of("Hello.class");
        Files.write(path, cf.toBytes());
        System.out.println("Class generated: " + path.toAbsolutePath());
    }
}

