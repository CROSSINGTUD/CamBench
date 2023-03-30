# CamBench_Cap - A benchmark to test the analysis capabilities of cryptographic API misuse detectors

CamBench\_Cap contains 280 true- and false-positive test cases that cover context-, field-, flow-, path-, and object-sensitivity as well as interprocedurality and mixed-sensitivities.
Furthermore, every test case is accompanied by a metadata file with additional information.
<br>
<br>

## Building the benchmark

We used gradle as build tool. To build the benchmark, simply run

```
gradlw build
```


The evaluation folder contains evaluation results of five static analysis tools: CogniCrypt_SAST, CryptoGuard, FindSecBugs, SonarQube, and VisualCodeGrepper.