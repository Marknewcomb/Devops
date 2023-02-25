pipeline{
    agent any
    stages{
        stage("Clean"){
            steps{
                deleteDir()
            }

        }
		stage("Clone"){
		    steps{
		    	bat "git clone https://github.com/Marknewcomb/Devops.git"
		    }

		}
		stage("Build"){
		    steps{
		        dir("Devops"){
		            bat "mvn clean install"
		        }

		    }

		}

		stage("Deploy"){
		    steps{
		        dir("Devops"){
		            bat "docker build -t devops ."
		            bat "docker login -u mnewcomb21 -p 196711aaAA!!"
		            bat "docker tag devops mnewcomb21/devops"
		            bat "docker push mnewcomb21/devops"
		        }

		    }

		}

    }

}
