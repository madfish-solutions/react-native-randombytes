# react-native-get-random-values with react-native-randombytes interface

This module is useful to set up `node-libs-react-native` in a React Native project with bridgeless architecture.

## Installation

1. Edit `package.json`

```json
{
  // other properties
  "resolutions": {
    // other resolutions
    "node-libs-react-native/react-native-crypto/react-native-randombytes": "madfish-solutions/react-native-randombytes",
    "node-libs-react-native/react-native-randombytes": "madfish-solutions/react-native-randombytes"
  }
}
```

```sh
npm install
npx pod-install
```

> 💡 If you use the Expo managed workflow you will see "CocoaPods is not supported in this project" - this is fine, it's not necessary.

## API

See [react-native-randombytes usage](https://github.com/mvayngrib/react-native-randombytes?tab=readme-ov-file#usage)
