cd ..
docker-compose down
docker compose -f docker-compose.yml -f docker-compose.dev.yml --env-file .env.development up --build