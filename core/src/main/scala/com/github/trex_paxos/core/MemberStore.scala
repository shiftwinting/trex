package com.github.trex_paxos.core

import com.github.trex_paxos.{Era, Membership}

trait MemberStore {
  def saveMembership(era: Era): Era

  /**
    * @return The latest cluster membership
    */
  def loadMembership(): Option[Era]
}
