#!/bin/bash
set -ex
sfctl application upload --path serviceFabricSampleApplication --show-progress
sfctl application provision --application-type-build-path serviceFabricSampleApplication
sfctl application create --app-name fabric:/serviceFabricSampleApplication --app-type serviceFabricSampleApplicationType --app-version 1.0.0
