# gradle-launch4j-example
Example repo showcasing how to use the [gralde-launch4j] plugin correctly.

## Current Issue
Clone and run:

    ./gradlew clean build shadowJar createAllExecutables

Output is:

    :clean
    :compileJava UP-TO-DATE
    :compileGroovy
    :processResources UP-TO-DATE
    :classes
    :jar
    :startScripts
    :distTar
    :distZip
    :assemble
    :compileTestJava UP-TO-DATE
    :compileTestGroovy UP-TO-DATE
    :processTestResources UP-TO-DATE
    :testClasses UP-TO-DATE
    :test UP-TO-DATE
    :check UP-TO-DATE
    :build
    :shadowJar
    :createExe FAILED

    FAILURE: Build failed with an exception.

    * What went wrong:
    Execution failed for task ':createExe'.
    > Launch4J finished with non-zero exit value 1
      launch4j: Application jar doesn't exist.


    * Try:
    Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output.
