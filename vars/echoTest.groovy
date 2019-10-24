def call(String msg) {
  echo msg
  sh """
    pwd
  """
  pipeline {
    agent any
    
    stages {
      stage('shared-stage') {
        steps {
           echo "In shared stage"
        }
      
      }
    }
  }
}
