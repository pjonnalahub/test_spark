
package com.tmo.test

import org.apache.spark.sql.{Column, SparkSession, functions, streaming}

object testSpark {
  def main(args: Array[String]): Unit = {
    println("test")
    val spark = SparkSession.builder()
      .appName("app_name")
      .enableHiveSupport()
      .getOrCreate()
  }

}
