#/bin/bash

echo === Deploying web site to s3 ===
aws s3 sync www/ s3://worter/
echo === Done ===
