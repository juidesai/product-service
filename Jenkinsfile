pipeline {
    agent any


    stages {
       stage('Build') {
          steps {
             sh 'gradle clean compileJava'
             sh './gradlew clean build'
          }
       }
       stage('Deploy'){
                  steps{
                      sh 'cf push product-service -p ./build/libs/com.solstice.productservice-0.0.1-SNAPSHOT.jar --random-route'
                  }
       }
    }
}
