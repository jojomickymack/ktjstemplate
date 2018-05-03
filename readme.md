## Template For Kotlin Js Project

The project template in intellij for kotlinjs requires that some stuff be added - basically you need to tell gradle where the kotlin sourcecode is, 
where to put the compiled js, and also to copy the kotlin.js library in there as well. [The native document 
object](https://kotlinlang.org/api/latest/jvm/stdlib/org.w3c.dom/-document/index.html) can do a lot of great stuff, but 
[kotlinx](https://github.com/Kotlin/kotlinx.html) is where you get a nice shorthand dsl for declaring html.

That stuff is in the build.gradle, just run the build task and all resources should be gernerated in a folder called 'web', just open the 'index.html' 
file in a browser and you should see the generated elements appear.
