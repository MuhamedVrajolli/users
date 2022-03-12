cd "$(dirname "$0")"

cd ..

./gradlew clean build -x test

docker build -t users .