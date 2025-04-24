def call(String imageName, String imageTag, String DockerhubUser){
  echo "pushing image to dockerhub"
  withCredentials([usernamePassword(
         "credentialsId":"docker",
          passwordVariable:"dockerhubpass",
          usernameVariable:"dockerhubuser")]){
    
          sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
          sh "docker push ${DockerhubUser}/${ImageName}:${ImageTag}"
      }
}
