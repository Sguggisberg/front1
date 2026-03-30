# Build Stage
FROM node:20 AS build

WORKDIR /app
COPY . .
RUN npm install
RUN npm run build

# Serve mit Nginx
FROM nginx:alpine
COPY --from=build /app/dist/front/browser /usr/share/nginx/html

EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
