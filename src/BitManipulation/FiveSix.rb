# 5.6	
# Write a program to swap odd and even bits in an integer with as few instructions as
# possible (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, etc).


def swapOddEvenBit(int)
	return ((int & 0xaaaaaaaa) >> 1) | ((int & 0x55555555) << 1)
end
puts 41.to_s(2)
puts swapOddEvenBit(41).to_s(2)