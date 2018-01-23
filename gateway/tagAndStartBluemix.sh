
##BLUEMIX_REGISTRY_HOST=registry.ng.bluemix.net
##BLUEMIX_REGISTRY_NAMESPACE=olucht
echo ------------------------------------BUILD IMAGE------------------------------------
bluemix ic build -t $BLUEMIX_REGISTRY_HOST/$BLUEMIX_REGISTRY_NAMESPACE/gateway --no-cache --pull .
echo ------------------------------------START Container---------------------------------
bluemix ic run --name gateway -p 6379 $BLUEMIX_REGISTRY_HOST/$BLUEMIX_REGISTRY_NAMESPACE/gateway

