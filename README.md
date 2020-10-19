# Jenkins Shared Pipeline Library

This repository contains the shared pipeline library for the Jenkins CI server, developed for and used by the ONS FDI project.

## Setup

This library has a variety of functions written in Groovy under the vars directory. 
In order to to use this library, one needs to add a line `@Library('pipeline-library') _` to the top of the Jenkinsfile.

For further details on this setup see the following Jenkins URL: https://jenkins.io/doc/book/pipeline/shared-libraries/
