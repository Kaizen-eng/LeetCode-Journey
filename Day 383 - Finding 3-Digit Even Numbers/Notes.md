# ✦ Notes

The two important checks are easy to miss:

1. A three-digit number cannot begin with `0`.
2. An even number must end in an even digit.

Using indices instead of comparing digit values lets duplicate digits be used correctly, as long as they come from different positions. A boolean array also makes duplicate results disappear without any extra sorting or set conversion.
