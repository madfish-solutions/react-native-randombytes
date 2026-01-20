module.exports = {
  dependency: {
    platforms: {
      android: {
        componentDescriptors: [],
        cmakeListsPath: null,
        packageImportPath: 'import org.linusu.RNGetRandomValuesPackage;',
        packageInstance: 'new RNGetRandomValuesPackage()',
      },
      ios: {
        podspecPath: './react-native-get-random-values.podspec',
      },
    },
  },
};
