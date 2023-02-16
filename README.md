# Commands

For execute command you have need a window power shell

Shift + Click Right In your Explorer Files

| Platform                     | Command                          |
| ---------------------------- | -------------------------------- |
| Show all commands            | `./gradlew task`                 |
| Prepare Your Workspace       | `./gradlew setupDecompWorkspace` |
| Environment on eclipse       | `./gradlew eclipse`              |
| Environment on IntelliJ IDEA | `./gradlew idea`                 |
| Compile into java file       | `./gradlew build`                |

if there has a problem download :
<a href="https://maven.minecraftforge.net/net/minecraftforge/forge/1.7.10-10.13.4.1614-1.7.10/forge-1.7.10-10.13.4.1614-1.7.10-src.zip">Forge src - 1.7.10(1614)</a>

edit the files `gradle\wrapper\gradle-wrapper.properties` :
```properties
distributionBase=GRADLE_USER_HOME
distributionPath=wrapper/dists
# Distribution in default is "https\://services.gradle.org/distributions/gradle-2.0-bin.zip" the file .zip is obsolete remplace the 2.0 -> 2.6
distributionUrl=https\://services.gradle.org/distributions/gradle-2.6-bin.zip
zipStoreBase=GRADLE_USER_HOME
zipStorePath=wrapper/dists
```

and redone the installation with commands :
- `./gradlew task`
- `./gradlew setupDecompWorkspace`
- `./gradlew eclipse or idea`
When you have finish prepare the file build.gradle like that :

```gradle
buildscript {
    repositories {
        mavenCentral()
        maven {
            name = "forge"
            url = "http://files.minecraftforge.net/maven"
        }
        maven {
            name = "sonatype"
            url = "https://oss.sonatype.org/content/repositories/snapshots/"
        }
    }
    dependencies {
        classpath 'net.minecraftforge.gradle:ForgeGradle:1.2-SNAPSHOT'
    }
}

apply plugin: 'forge'

version = "1.0"
group= "com.mod.uramod" // http://maven.apache.org/guides/mini/guide-naming-conventions.html
archivesBaseName = "uramod"

minecraft {
    version = "1.7.10-10.13.4.1614-1.7.10"
    runDir = "eclipse"
}

dependencies {
    // you may put jars on which you depend on in ./libs
    // or you may define them like so..
    //compile "some.group:artifact:version:classifier"
    //compile "some.group:artifact:version"
      
    // real examples
    //compile 'com.mod-buildcraft:buildcraft:6.0.8:dev'  // adds buildcraft to the dev env
    //compile 'com.googlecode.efficient-java-matrix-library:ejml:0.24' // adds ejml to the dev env

    // for more info...
    // http://www.gradle.org/docs/current/userguide/artifact_dependencies_tutorial.html
    // http://www.gradle.org/docs/current/userguide/dependency_management.html

}

processResources
{
    // this will ensure that this task is redone when the versions change.
    inputs.property "version", project.version
    inputs.property "mcversion", project.minecraft.version

    // replace stuff in mcmod.info, nothing else
    from(sourceSets.main.resources.srcDirs) {
        include 'mcmod.info'
                
        // replace version and mcversion
        expand 'version':project.version, 'mcversion':project.minecraft.version
    }
        
    // copy everything else, thats not the mcmod.info
    from(sourceSets.main.resources.srcDirs) {
        exclude 'mcmod.info'
    }
}

```

and execute command `./gradlew build`

# For More Help
-------------------------------------------
Source installation information for modders
-------------------------------------------
This code follows the Minecraft Forge installation methodology. It will apply
some small patches to the vanilla MCP source code, giving you and it access 
to some of the data and functions you need to build a successful mod.

Note also that the patches are built against "unrenamed" MCP source code (aka
srgnames) - this means that you will not be able to read them directly against
normal code.

Source pack installation information:

Standalone source installation
==============================

To install this source code for development purposes, extract this zip file.
It ships with a demonstration mod. Run 'gradlew setupDevWorkspace' to create
a gradle environment primed with FML. Run 'gradlew eclipse' or 'gradlew idea' to
create an IDE workspace of your choice.
Refer to ForgeGradle for more information about the gradle environment
Note: On macs or linux you run the './gradlew.sh' instead of 'gradlew'

Forge source installation
=========================
MinecraftForge ships with this code and installs it as part of the forge
installation process, no further action is required on your part.

For reference this is version @MAJOR@.@MINOR@.@REV@.@BUILD@ of FML
for Minecraft version @MCVERSION@.

LexManos' Install Video
=======================
https://www.youtube.com/watch?v=8VEdtQLuLO0&feature=youtu.be

For more details update more often refer to the Forge Forums:
http://www.minecraftforge.net/forum/index.php/topic,14048.0.html
