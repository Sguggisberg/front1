# Build Stage
FROM node:20 AS build

WORKDIR /app
COPY . .
RUN npm install
ARG BUILD_ENV=production

# 👇 Dynamischer Build
RUN if [ "$BUILD_ENV" = "production" ]; then \
      npm run build -- --configuration=production; \
    else \
      npm run build; \
    fi


# Serve mit Nginx
FROM nginx:alpine
COPY --from=build /app/dist/front/browser /usr/share/nginx/html

EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
