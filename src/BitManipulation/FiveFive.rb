# 5.5	
# Write a function to determine the number of bits required to convert integer A to
# integer B.
# Input: 31, 14
# Output: 2

def bitSwapRequired(a, b)
	count = 0
	(a ^ b).to_s(2).split('').each do |x|
		count += 1 if x == '1'
	end
	puts count
end

bitSwapRequired(31,14)