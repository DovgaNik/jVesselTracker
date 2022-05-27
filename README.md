[![Java CI](https://github.com/DovgaNik/jVesselTracker/actions/workflows/ant.yml/badge.svg)](https://github.com/DovgaNik/jVesselTracker/actions/workflows/ant.yml)   [My PGP public key](https://dovganik.github.io/DovgaNik/) 

# jVesselTracker

An easy way to track marine vessels with a lightweight interface

## Installation

jVesselTracker is written in Java. This means that the project can be used on any device that supports java runtime, downloadable at [the official Oracle website](https://www.java.com/en/download/manual.jsp) 

1. Download a jar file from [releases page](https://github.com/DovgaNik/jVesselTracker/releases)

2. Run the downloaded file

**Note:** ready-to-use .exe files will be ready in near future

## Configuration

1. You have to put your API keys to the configuration pane

	1. Open the application
	
	2. Click on the little cogwheel button in the title bar![gear](src/jvesseltracker/icons/settings.png) 
	
	3. Copy-paste or type in your API keys to the first two fields
	
2. Decide on the preferred auto update delay and type in the chosen time in format of seconds. For example: I want my program to update once a minute, then I type in 60

## Usage

### Add a new vessel

1. Click on the plus button in the title bar ![add](src/jvesseltracker/icons/add.png) 

2. Copy-paste or type in the MMSI of wanted ship

3. If available, put in the IMO code

4. Write the name which will be used in the sidebar

5. Click on the "Add button"

### Remove a vessel

1. Select the vessel you want do delete in the sidebar on the left

2. Click on the minus button in the title bar ![](src/jvesseltracker/icons/delete.png) 

3. Confirm your desire to delete the vessel

### Edit vessel data

If you typed incorrect MMSI, IMO or name or you just want to change the ship

1. Select wanted place to change information in the sidebar on the left

2. Click on pencil button in the title bar ![](/home/dovganik/Documents/Projects/jVesselTracker/src/jvesseltracker/icons/edit.png) 

3. Change desired information

4. Press the button

### Refresh the data

If you don't want to waut untill the selected delay passes and you want to manually update the received information

1. Press refresh button ![](src/jvesseltracker/icons/refresh.png) 

### Show ship position on map

1. Press on the map pin button in the title bar![](src/jvesseltracker/icons/map.png) 

2. Select the map provider you want to use. These are Google, Yandex, OpenStreetMap and OpenSeaMap. OpenSeaMap is preferred as it provides more maritime data. However, you can use any of these if they are more convenient for you.

## Keyboard shortcuts

* To clear the working panel and hide selected ship press Escape

* If you don't want to choose the ship with your mouse, you should use F keys from F1 to F5

* Add new ship F6

* Delete a ship F7

* Edit ship data F8

* Open configuration panel F9

* Refresh the data F10

* Open map in browser F11