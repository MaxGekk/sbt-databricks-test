name := "sbt-plugin-test"

version := "0.1"

scalaVersion := "2.10.7"

import sbtdatabricks.DatabricksPlugin.autoImport._

// Your username to login to Databricks Cloud
dbcUsername := "token"

// Your password (Can be set as an environment variable)
dbcPassword := "dapie9ad18b666edcfeca45d39d1d8b7afdb"

// The URL to the Databricks Cloud DB Api.!
// Note: this plugin currently does not support the /api/2.0 endpoint, so values using that
// endpoint will be automatically rewritten to use /api/1.2.
dbcApiUrl := "https://field-eng.cloud.databricks.com"

// Add any clusters that you would like to deploy your work to. e.g. "My Cluster"
// or run dbcExecuteCommand
dbcClusters += "Hackathon" //if you want to attach your work to all clusters

// The location to upload your libraries to in the workspace e.g. "/Users/alice"
dbcLibraryPath := "/FileStore/maximgekk"

// Whether to restart the clusters every time a new version is uploaded to Databricks Cloud
//dbcRestartOnAttach := // Default true