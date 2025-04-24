def call(String url, String branch){
  echo "checkout stage"
  git url: url, branch: "${branch}"
  echo "cloning successful"
}
