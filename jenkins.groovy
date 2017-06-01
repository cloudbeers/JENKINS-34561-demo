echo 'Hello!'
node {
  checkout scm
  sh 'ls'
}
