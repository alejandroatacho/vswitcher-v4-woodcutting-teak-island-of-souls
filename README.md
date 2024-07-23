# TRIGGERS (Game Tick)

## Table of Contents
- [Requirements](#requirements)
- [Go to Island of Souls (Soul Wars Area)](#go-to-island-of-souls-soul-wars-area)
- [Explanation](#explanation)
- [Anti Ban Delay](#anti-ban-delay)

## Requirements
- A dragon axe or dragon axe (ornament/infernal), unless your using the skiller version then just put any axe you want in your inventory as long as you can cut the wood
- Wear a strung rabbit feet necklace to prevent empty nests :3
- Wear a lightbringer/bearer ring for spec speed increase (optional, but recommended)
- Fairy ring code: `bjp`
- If you have a rune pouch, put `earth, air, law` (for house teleport or bring house tabs to bank nests after 2-4 hours)

## Go to Island of Souls (Soul Wars Area)
You don't need Monkey Madness 2 (MM2) or Monkey Madness in general. If you want, you can even abuse the two birds for 2-tick woodcutting (this script doesn't provide that... yet).

To trigger the script, add the Game Tick trigger and follow these steps:

1. Copy and paste the `Teak_version.java` code into your code editor.
2. Save the file.

## Explanation

The provided Java code snippet performs the following actions:

### Variable for Level
- `lvl = client.getBoostedSkillLevel(Skill.WOODCUTTING);`

### Grabbing Bird Nests
- `grabBirdNests()` method: Takes bird nests from the ground using specific item IDs.

### Handling Random Events
- `handleRandomEvents()` method: Dismisses random events.

### Using Special Attack
- `useSpecialAttack()` method: Checks if there is enough special energy and performs a special attack.

### Managing Inventory
- `manageInventory()` method: Checks if the inventory is full and drops a specific item (Teak logs ID) if necessary.

### Main Loop
The main loop of the script checks if the player has no animation and the inventory does not have a full stack of Teak logs. If the conditions are met, the script proceeds to:
- `grabBirdNests()`: Takes bird nests from the ground.
- `handleRandomEvents()`: Dismisses random events.
- `useSpecialAttack()`: Checks and performs a special attack if there is enough special energy.
- `manageInventory()`: Checks and drops a specific item if the inventory is full.
- `v.getWoodcutting().chop(40758)`: Cuts Teak logs on the Island of Souls using the specific object ID (40758).

## Anti Ban Delay

- Min: 200
- Max: 250

This is an optional setting that you can customize according to your preferences.

---

**Note**: The information provided above is for reference only. Please ensure that you understand the code and its implications before implementing it in your project.

For more details, please refer to the [documentation](https://vswitcher.com/portal/manager).
