#!/bin/bash
java -classpath /usr/lib/hocl/hocl.jar:/home/hfernand/workspace/hocl-PR2/src/fr/inria/hocl/workflow/example/clientChService/bin:/home/hfernand/workspace/hocl-PR2/src/fr/inria/hocl/workflow/example/clientChService/.  -Djava.rmi.server.codebase='file:/home/hfernand/workspace/hocl-PR2/src/fr/inria/hocl/workflow/example/clientChService/./bin/ file:/usr/lib/hocl/hocl.jar' -Djava.rmi.server.hostname=localhost -Djava.security.policy=/usr/lib/hocl/rmi/no.policy fr.inria.hocl.workflow.example.clientChService.RunClientChService_gen;
exit $?;
