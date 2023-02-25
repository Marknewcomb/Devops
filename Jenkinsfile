Pipeline{
    agent any
    stages{
        stage("Clean"){
            steps{
                deleteDir()
            }

        }
		stage("Build"){
		    steps{
		        bat "mvn clean install"
		    }

		}
		stage("Deploy"){
		    steps{
		        bat "java -cp target/Devops-0.0.1-SNAPSHOT-jar-with-dependencies.jar com.newcomb.java.Main"
		    }

		}

    }

}
