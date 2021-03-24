# Tp_Pokemon


Tp Pokémon
Pokémon are very cute creatures, but they are also a
good example to illustrate the heritage. I therefore suggest that you start with
create a Pokemon class that contains (among others):
- A name attribute that represents the name of the Pokémon.
- An hp attribute (for Health Points) which represents the health points of the
Pokemon.
- An attribute called atk which represents the base strength of the attack
of the Pokémon.
- A constructor to instantiate Pokémon properly.
- An isDead () method which returns a boolean to indicate whether a Pokémon is dead (hp == 0) or not.
- An attacking method (Pokemon p) that allows the calling Pokemon
to attack the past Pokémon
- As a parameter. Attack deducts atk points from the hp health of the attacked Pokémon p.
- A redefinition of the toString method which displays the information of the
Pokemon.
2
In addition to normal Pokémon (described through the Pokemon class) there are
three types of Pokémon.
- Fire-type Pokémon,
- Water-type Pokémon
- Plant-type Pokémon (in fact there are 17 types in all, but we
not going to have fun coding them all):
Attack
1. Fire-type Pokémon are super effective against Fire-type Pokémon.
type Plant and deal twice as much damage to them (2 * atk). On the other hand,
they are very ineffective against Water-type or type Pokémon.
Fire and only deal half damage (0.5 * atk) to them. They inflict
normal damage to Normal-type Pokémon
2. Water-type Pokémon are super effective against water-type Pokémon.
Fire type and deal twice as much damage to them (2 * atk). On the other hand, they
are very ineffective against Water-type or
Plant and only deal half damage (0.5 * atk) to them. They inflict
normal damage to Normal-type Pokémon.
3. Finally, Plant-type Pokémon are super effective against Water-type Pokémon and deal twice as much damage (2 * atk) to them. By
cons, they are not very effective against Pokémon of the type Plant or
Fire type and only deal half damage (0.5 * atk) to them. They deal normal damage to Normal-type Pokémon.
3
Create three classes Pokemon Fire, Pokemon Water, and Pokemon Plant that inherit the
Pokemon class and which represent the three types of Pokemon mentioned above. Then have fun doing Pokémon battles. 
