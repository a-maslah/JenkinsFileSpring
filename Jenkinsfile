pipeline {
    agent any
   
    stages {
        stage("init") {
            steps {
               echo 'init app'
            }
        }
        stage("build") {
            steps {
                 echo 'build app'
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

