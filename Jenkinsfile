pipeline {
      agent any

      stages {
        stage('checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Build and Test') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'mvn -B clean verify'
                    } else { 
                        bat 'mvn -B clean verify'

                    }
                }
            }
        }

        post {
            success {
                echo 'BUILD SUCCESSFUL'
        }
            failure {
                echo 'BUILD FAILED'
            }
        }        

     
}











}