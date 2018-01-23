# Create new DB via PUT:
# curl -X PUT -H "Content-Type: application/json" -d 'test' "localhost:9082/12-factor-application"

# Create new items via POST:
# curl -X POST -H 'Content-Type: application/json' -d '{"username":"davidwalsh","password":"something"}' "http://localhost:9082/12-factor-application/test"


echo "JAVA_HOME= " $JAVA_HOME
echo "PATH= " $PATH
echo "Export dbUsername dbUrl dbPassword"
export dbUsername=0b563b02-1e03-481d-863d-c32a477aef8f-bluemix
export dbUrl=https://0b563b02-1e03-481d-863d-c32a477aef8f-bluemix:770a564648417076f49c7bb0275fbe7b1157aa842894ddb21bf208c74a948279@0b563b02-1e03-481d-863d-c32a477aef8f-bluemix.cloudant.com
export dbPassword=770a564648417076f49c7bb0275fbe7b1157aa842894ddb21bf208c74a948279
echo "Export WLP_USER_DIR"
export WLP_USER_DIR=/Users/oliverlucht/bluemix/12factorapp/sample.microservices.12factorapp/12-factor-wlpcfg
echo "Complile Source"
cd ~/bluemix/12factorapp/sample.microservices.12factorapp
mvn install -Pwlp-install -Dwlp.install.dir=/Users/oliverlucht/bluemix/liberty/wlp

echo ----------------------------- DONE ----------------------------------

#echo "Start Server and 12FactorAppServer: "
#~/bluemix/liberty/wlp/bin/server run 12FactorAppServer

