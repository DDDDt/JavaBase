## NanoID

NanoID 使用比 UUID 更大的字母表，因此较短的 ID 可以用于较长的 UUID 相同的目的

NanoId 只要 108 个字节那么大，与 UUID 不同，NanoID 的大小要小 4.5 倍，并且没有任何依赖关系。此外，大小限制已用于将大小从另外 35% 减小

大小减少直接影响数据的大小。例如：使用 NanoID 的对象小而紧凑，能够用于数据传输和存储。

更安全，在大多数随机生长器中，它们使用不安全的 Math.random()，但是 NanoID 使用 crypto module 和 Web Crypto，意味着 NanoID 更安全

NanoID 在 ID 生成器的实现过程中使用了自己的算法，称为统一算法，而不是使用随机字母表，random % alphabet

快速又紧凑，NanoID 比 UUID 快 60%, 与 UUID 字母表中的 36 个字符不同，NanoID 只有 21 个字符


