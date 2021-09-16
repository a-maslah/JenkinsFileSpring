pipeline {
    agent any
    tools {
      maven 'MAVEN'
    }
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
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/a-maslah/JenkinsFileSpring']]])
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
        
        stage("test") {
             
             steps {
                 echo 'test app'
                
                 
            }
            }
        stage("deploy") {
                steps {
                 echo 'tDeploy app'
            }
        }
        
    }   
}

