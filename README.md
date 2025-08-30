# Farmer's Delight - Nova Addon
*Based on vectorwing's [FarmersDelight mod](https://github.com/vectorwing/FarmersDelight)*

<img src="https://i.imgur.com/aDELzhM.png" width="50%">
<p align="center">
  <a href="https://github.com/Atea-Studio/NovaFarmersDelight/stargazers">
    <img src="https://img.shields.io/github/stars/Atea-Studio/NovaFarmersDelight">
  </a>
  <a href="https://github.com/Atea-Studio/NovaFarmersDelight/releases">
    <img src="https://img.shields.io/github/downloads/Atea-Studio/NovaFarmersDelight/total.svg">
  </a>
</p>
---

<img src="https://i.imgur.com/Iy0ddGy.png" width="45%"> <img src="https://i.imgur.com/Ktk1Pee.png" width="45%">

## Overview

**Farmer's Delight** is a Nova Addon that brings the beloved farming and cooking mechanics of the original **Farmer's Delight** mod into Paper servers using the [**Nova Framework**](https://github.com/xenondevs/Nova).

With an intuitive cooking system and a variety of familiar ingredients, players can prepare **delicious meals** such as sandwiches, salads, stews, desserts, and more. Additionally, this addon introduces **Decorative blocks and items** for immersive builds.

Whether you're running a survival server, an RPG world, or just want to enhance the farming and cooking aspects of Minecraft, this plugin is for you!

## Features
- 🍽 **Cooking System** – Craft and cook a variety of meals with unique effects.
- 🛠 **New Tools & Equipment** – Scavenge, prepare, and store food efficiently.
- 🏡 **Decorative Elements** – Customize kitchens, farms, and more.

## Installation
1. **Ensure you have PaperMC** installed on your server.
2. [**Download the latest release of the addon**](https://github.com/Atea-Studio/NovaFarmersDelight/releases)
4. [**Install the Nova plugin**](https://github.com/xenondevs/Nova)
5. **Place Nova plugin and the FarmersDelight Nova addon** into your `plugins/` folder.
6. **Restart your server** and enjoy the new farming and cooking mechanics!

## Configuration
The addon comes with config files in `plugins/FarmersDelight`, allowing server owners to adjust mechanics, balance recipes, and tweak gameplay elements.

## Contributing
Thank you for your interest in contributing! If you'd like to help improve the plugin, feel free to:
- Report issues or suggest new features via the **GitHub Issues** page.
- Submit pull requests with optimizations, fixes, or new content.

## Support
If you encounter any issues or have feature requests, please open an issue on GitHub!

Happy farming! 🌾🍽

## CraftEngine Migration (Experimental)

This repository now contains a minimal scaffolding for a future **CraftEngine**
port. The `CraftEngineFarmersDelight` entry uses a simple furniture block
storage to register modelled blocks that can be interacted with. An example
model configuration is provided at
`src/main/resources/craftengine/furniture/stove.yml`.

