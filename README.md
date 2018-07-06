Module for access python to alfresco repository

INSTALL:
$ alias build_py4j='cd ${ALFRESCO_PY4J_SOURCE_CODE_ROOT_FOLDER} && cd repo && mvn clean package -Dmaven.alfresco.warLocation=${ALFRESCO_WEBAPPS}/alfresco'
$ build_py4j


RUN:
>>> from py4j.java_gateway import JavaGateway, java_import
>>> import json, re, urllib
>>> import requests
>>> gateway = JavaGateway()
>>> jvm = gateway.jvm;null = None;true = True;false = False
>>> app_context = jvm.ru.p4j.py4j.ApplicationContextProvider()
>>> namespaceService = app_context.getApplicationContext().getBean('namespaceService')
>>> QName = gateway.jvm.org.alfresco.service.namespace.QName;
>>> NodeRef = jvm.org.alfresco.service.cmr.repository.NodeRef
>>> StoreRef = jvm.org.alfresco.service.cmr.repository.StoreRef
