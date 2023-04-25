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

## Future Improvements
### RSA minimum secure key size
For 2023 the key size of at least 2048 bits is still considered secure.
However, from 2024 onward the minimum required key length will be 3072 bits.
For evaluations or new versions of CamBench the minimum key size should be set to 3072 bits.
In the current version only the corrected case in the basic test cases reflects this value as the target group for
evaluation are current cryptographic API misuse detection tools.

### Password-Based Key Derivation Functions - iteration count
The minimum value for the iteration count for password-based key derivation functions in the often referred to guideline
from NIST, published in 2010, of 1.000 (c.f. https://csrc.nist.gov/publications/detail/sp/800-132/final) is currently
under review and revised standards are expected. 
Since the iteration count is meant to increase the difficulty of attacks, we chose to stick with a larger value from 
industry which is part of the revision discussion. Thus, the minimum value in CamBench should be at least be 10.000.000.
This value is an approximation since a concrete value is currently an open discussion for standardization
(c.f. https://csrc.nist.gov/news/2023/proposal-to-revise-nist-sp-800-132-pbkdf).
We chose this value to reflect a reasonable magnitude with relevance for industry
(cf. https://help.apple.com/pdf/security/en_US/apple-platform-security-guide.pdf - p.81).
In future versions this value should be adapted to the revised guideline.

