# A sample NodeJS REST Api in Kotlin
[![License](https://img.shields.io/badge/License-MIT-blue.svg)][license-url]  

✅Ready to be deployed to Heroku.  
▶️Demo: https://heroku-kotlin-node-api.herokuapp.com/

## ⏳ Prerequisites

1. [NodeJs](https://nodejs.org/en/).
3. The [Heroku CLI](https://cli.heroku.com/).

## 🎬 Running Locally
1. Clone this repository on your local machine.
2. In a terminal window, go to the root directory of the repo and run:
```sh
./gradlew build
heroku local:start
```

Your app should now be running on [localhost:5000](http://localhost:5000/).

## ☁ Deploying to Heroku

```sh
$ heroku create --buildpack heroku/nodejs
$ heroku buildpacks:add --index 1 heroku/gradle
$ git push heroku master
$ heroku open
```

## 📜 License
Licensed with the [MIT License][license-url].

[license-url]: https://github.com/ovitrif/heroku-kotlin-node-api/blob/master/LICENSE
