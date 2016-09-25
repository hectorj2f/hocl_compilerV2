#!/bin/bash
java -classpath /usr/lib/hocl/hocl.jar:/home/hfernand/workspace/hocl-PR2/src/fr/inria/hocl/workflow/example/sampleChService1/bin:/home/hfernand/workspace/hocl-PR2/src/fr/inria/hocl/workflow/example/sampleChService1/.  -Djava.rmi.server.codebase=file:/usr/lib/hocl/hocl.jar -Djava.rmi.server.hostname=localhost -Djava.security.policy=/usr/lib/hocl/rmi/no.policy fr.inria.hocl.workflow.example.sampleChService1.RunSampleChService1_gen;
exit $?;
