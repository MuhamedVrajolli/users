cd "$(dirname "$0")"

docker network create ucx

docker volume create --name=postgres
docker volume create --name=postgres-data

docker volume create --name=rb-data
docker volume create --name=rb-log

docker-compose up -d