FROM amalgam8/a8-sidecar:alpine

ENV A8_SERVICE=gateway
ENV A8_REGISTRY_URL=http://Amalgam8-ol-registry.mybluemix.net
ENV A8_REGISTRY_POLL=5s
ENV A8_CONTROLLER_URL=http://Amalgam8-a8-controller.mybluemix.net
ENV A8_CONTROLLER_POLL=5s
ENV A8_LOG=true
ENV A8_PROXY=true

EXPOSE 6379 

CMD ["/usr/bin/a8sidecar"]
#CMD [“/usr/bin/run_filebeat.sh"] 


