package com.deepdive.spark2

import org.apache.spark.sql.SparkSession

object SparkTest {
  
 // def main(arg: String[])
  
  def main(args: Array[String]): Unit = {
    val spark: SparkSession = SparkSession.builder().appName("SparkTest").master("local").getOrCreate();
    println("Spark Session: " + spark)
  }
  
}