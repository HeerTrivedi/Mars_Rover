Feature: MarsRoverCucumber Test


  Scenario Outline: Rover direction facing and positioning initialisation
    Given a rover positioned at <x>, <y> facing <facing>
    When the rover receives the command <command>
    Then the rover's final position should be <finalX>, <finalY> facing <finalFacing>

    Examples:
      | x | y | facing | command        | finalX | finalY | finalFacing |
      | 1 | 2 | "N"    | "LMLMLMLMM"    | 1      | 3      | "N"         |
      | 3 | 3 | "E"    | "MMRMMRMRRM"   | 5      | 1      | "E"         |














