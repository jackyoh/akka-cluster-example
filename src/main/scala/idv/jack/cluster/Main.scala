package idv.jack.cluster

import akka.actor.{ActorSystem, Props}
import akka.cluster.ClusterEvent.MemberEvent


object Main {

  def main(args: Array[String]): Unit ={
    val system = ActorSystem("Akkademy")
    val clusterController = system.actorOf(Props[ClusterController], "clusterController")
    clusterController ! "hello world"
  }
}
