#!/usr/bin/env bash

java -jar libs/openapi-generator-cli.jar generate \
  -i plantly.oas3.yaml \
  -o plantly-plant-api \
  -g spring \
  -c plantly-config.yaml \
  --ignore-file-override ".openapi-generator-plant-api-ignore" \
  --model-package "dev.martinb.plantly.plantapi.model" \
  --api-package "dev.martinb.plantly.plantapi.api" \
  --artifact-id "plantapi" \
  --group-id "dev.martinb.plantly" \
  --artifact-version "1.0.0"
#  --global-property "apis=Plant"