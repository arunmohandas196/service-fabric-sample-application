#!/bin/bash
set -ex
sfctl application delete --application-id serviceFabricSampleApplication
sfctl application unprovision --application-type-name serviceFabricSampleApplicationType --application-type-version 1.0.0
sfctl store delete --content-path serviceFabricSampleApplication
