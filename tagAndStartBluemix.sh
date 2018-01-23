
##BLUEMIX_REGISTRY_HOST=registry.ng.bluemix.net
##BLUEMIX_REGISTRY_NAMESPACE=olucht
## -p 8080 vs 9083:9082 ???
echo ------------------------------------BUILD IMAGE------------------------------------
bluemix ic build -t $BLUEMIX_REGISTRY_HOST/$BLUEMIX_REGISTRY_NAMESPACE/12factorappa8:v1.0 --no-cache --pull .
echo ------------------------------------START Container---------------------------------
bluemix ic run --name 12factorappa8 -p 9082 $BLUEMIX_REGISTRY_HOST/$BLUEMIX_REGISTRY_NAMESPACE/12factorappa8:v1.0

