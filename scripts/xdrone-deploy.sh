#!/bin/bash

echo 'before'

source /opt/ros/kinetic/setup.bash
python /xdrone/result.py

echo 'after'

sleep 2
