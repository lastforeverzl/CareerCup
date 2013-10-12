def printBinary(str)
	return str.to_i.to_s(2).length < 32 ? str.to_i.to_s(2) : 'ERROR'
end

puts printBinary('354364534356.2534653246345')