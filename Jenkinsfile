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
            }
        }
        stage("test") {
             
             steps {
                 echo 'test app'
            }
            }
            steps {
                steps {
                 echo 'test 2 app'
            }
            }
        }
        stage("deploy") {
            steps {
                steps {
                 echo 'tDeploy app'
            }
            }
        }
    }   
}

