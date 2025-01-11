# Possible QoL

- setting render distance/ zoom level
- view mode in which the game logic is paused but still 
  possible to move around the grid
- upgrading buildings/ tiered buildings

Notes:
- use core.command queue
- pausing always happens at the start of the next tick, so 
  resuming can begin at the start of a tick
- pass data between client-server with respond-like json object
- player can load previous save or start new game
- core.command queue on server, one core.command per tick
- on start the game loads the "default" save 
  - when loading or saving a savefile without a name, save it 
    the "default" savefile

Loading previous files:
1. On client start, server offline. 
2. Player will enter
credential to load a save
3. On submit, client send request to
start the server, 
   - if accepted, server starts and respond to 
        client then client starts requesting game state


**TODO**: 
- data level document validation for mongodb 