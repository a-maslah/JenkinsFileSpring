pipeline {
    agent any
    environment {
         NEW_VERSION = '1.0.1'
    }
    stages {
        stage("init") {
            steps {
               echo 'init app'
            }
        }
        stage("build") {
            steps {
                 echo 'build app'
                echo "build app ${NEW_VERSION}"
                sh 'mvn build'
            }
        }
        stage("test") {
             
             steps {
                 echo 'test app'
                 sh 'mvn package'
            }
            }
        stage("deploy") {
                steps {
                 echo 'tDeploy app'
            }
        }
        
    }   
}

